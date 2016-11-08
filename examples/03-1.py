import json
example='03-1'
data={}
data['width']=5
data['height']=1
data['hints']={}
data['hints']['vertical']=['4']
data['answer']=[]
data['answer'].append([0,0,0,0,0])
json.dump(data,open('examples/'+example+'.json','w'),sort_keys=True)
