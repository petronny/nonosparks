import json
stage='18'
data={}
data['width']=10
data['height']=15
data['name']='Octopus vs elephant'
data['hints']={}
data['hints']['horizontal']=['5','2 1 1 4','1 1 2 1','3 1 2 1 1','1 5','3 1 2 1 3','2 5 2','2 3 1 2 2','3 2 1','1 2 1 2 1 1']
data['hints']['vertical']=['2 4','2 4','1 1 2 2','1 1 2 1','2 1 2','1 5 1','2 1 2','5','2 1 1','2 2','2 1 2','1 2 1','1 1 2 1','1 1 1 1','1 1 1 1']
data['answer']=[]
data['answer'].append([0,1,1,0,0,0,1,1,1,1])
data['answer'].append([1,1,0,0,0,1,1,1,1,0])
data['answer'].append([1,0,1,0,1,1,0,0,1,1])
data['answer'].append([1,0,0,1,0,1,1,0,0,1])
data['answer'].append([1,1,0,1,0,0,1,1,0,0])
data['answer'].append([1,0,0,1,1,1,1,1,0,1])
data['answer'].append([0,1,1,0,1,0,1,1,0,0])
data['answer'].append([0,0,1,1,1,1,1,0,0,0])
data['answer'].append([0,0,0,0,1,1,0,1,0,1])
data['answer'].append([0,0,0,1,1,0,0,0,1,1])
data['answer'].append([0,0,1,1,0,1,0,1,1,0])
data['answer'].append([0,1,0,0,0,0,1,1,0,1])
data['answer'].append([0,1,0,1,0,1,1,0,1,0])
data['answer'].append([0,1,0,0,0,1,0,1,0,1])
data['answer'].append([0,1,0,1,0,1,0,1,0,0])


json.dump(data,open(stage+'.json','w'),sort_keys=True)
