import json
stage='24'
data={}
data['width']=15
data['height']=15
data['name']='Dinosaur'
data['hints']={}
data['hints']['horizontal']=['1 3','1 1','3 1 2','1 1 2 2 1','2 3 1 2 1','1 1 1 1 2 2','1 3 1 3','1 1 1 3 2','1 1 2 2 1','1 2 1','1 2 1 5','1 3 1','6 3','1 5 1','1 1']
data['hints']['vertical']=['4','2 3','1 1 1 1 1','1 3 1','6 2 1 1','1 1 1 1','6 1 1','1 1','2 3','1 4 1 1','4 2 2 1','1 1 2 1 2','1 1 2 1 3','1 1 8','2 1 1 1 1']
data['answer']=[]
data['answer'].append([0,0,0,0,1,1,1,1,0,0,0,0,0,0,0])
data['answer'].append([0,0,0,1,1,0,0,0,1,1,1,0,0,0,0])
data['answer'].append([1,0,1,0,0,1,0,0,0,0,0,1,0,1,0])
data['answer'].append([0,0,1,0,0,0,0,0,1,1,1,0,1,0,0])
data['answer'].append([0,0,1,1,1,1,1,1,0,1,1,0,1,0,1])
data['answer'].append([0,0,0,0,1,0,1,0,1,0,0,0,1,0,0])
data['answer'].append([0,0,0,1,1,1,1,1,1,0,1,0,1,0,0])
data['answer'].append([0,0,0,1,0,0,0,0,0,0,0,0,1,0,0])
data['answer'].append([0,0,0,0,1,1,0,0,0,0,0,1,1,1,0])
data['answer'].append([0,0,0,1,0,1,1,1,1,0,0,1,0,1,0])
data['answer'].append([0,1,1,1,1,0,0,1,1,0,1,1,0,1,0])
data['answer'].append([1,0,0,0,1,0,1,1,0,0,1,0,1,1,0])
data['answer'].append([1,0,0,1,0,1,1,0,0,0,1,0,1,1,1])
data['answer'].append([1,0,1,0,0,1,1,1,1,1,1,1,1,0,0])
data['answer'].append([0,1,1,0,1,0,0,1,0,0,1,0,0,1,0])

json.dump(data,open(stage+'.json','w'),sort_keys=True)
